import java.util.Scanner;

class DataItem
{
        long dData;

        public DataItem(long dData)
        {
               this.dData = dData;
        }

        public void displayItem()
        {
               System.out.printf("/%d", dData);
        }
}

class Node
{
        private static final int ORDER = 4;
        private int numItems;
        private Node parent;
        private DataItem[] itemArray = new DataItem[ORDER - 1];
        private Node[] childArray = new Node[ORDER];

        public void connectChild(int childNum, Node child)
        {
               childArray[childNum] = child;
               if(child != null)
                     child.parent = this;
        }

        public Node disconnectChild(int childNum)
        {
               Node tempNode = childArray[childNum];
               childArray[childNum] = null;
               return tempNode;
        }

        public Node getChild(int childNum)
        {
               return childArray[childNum];
        }

        public Node getParent()
        {
               return parent;
        }

        public boolean isLeaf()
        {
               return childArray[0] == null ? true : false;
        }

        public int getNumItems()
        {
               return numItems;
        }

        public DataItem getItem(int index)
        {
               return itemArray[index];
        }

        public boolean isFull()
        {
               return numItems == ORDER - 1 ? true : false;
        }

        public int findItem(long key)
        {
               for(int i = 0; i < ORDER - 1; i++)
               {
                      if(itemArray[i] == null)
                           break;
                      else if(itemArray[i].dData == key)
                           return i;
               }

               return - 1;
        }

        public int insertItem(DataItem newItem)
        {
               long newKey = newItem.dData;
               numItems++;

               for(int i = ORDER - 2; i >= 0; i--)
                    if(itemArray[i] == null)
                         continue;
                    else
                    {
                         long itsKey = itemArray[i].dData;
                         if(newKey < itsKey)
                              itemArray[i + 1] = itemArray[i];
                         else
                         {
                              itemArray[i + 1] = newItem;
                              return i + 1;
                         }
                    }

                itemArray[0] = newItem;
                return 0;
        }

        public DataItem removeItem()
        {
                DataItem temp = itemArray[numItems - 1];
                itemArray[numItems - 1] = null;
                numItems--;
                return temp;
        }

        public void displayNode()
        {
                for(int i = 0; i < numItems; i++)
                      itemArray[i].displayItem();
                System.out.println("/");
        }
}

class Tree234
{
        private Node root = new Node();

        public int find(long key)
        {
               while(true)
               {
                       Node curNode = root;
                       int childNumber;

                       if((childNumber = curNode.findItem(key)) != -1)
                             return childNumber;
                       else if(curNode.isLeaf())
                             return -1;
                       else
                             curNode = getNextChild(curNode, key);
                }
        }

        public void insert(long dValue)
        {
                Node curNode = root;
                DataItem tempItem = new DataItem(dValue);

                while(true)
                {
                       if(curNode.isFull())
                       {
                             split(curNode);
                             curNode = curNode.getParent();

                             curNode = getNextChild(curNode, dValue);
                       }

                       else if(curNode.isLeaf())
                             break;
                       else
                             curNode = getNextChild(curNode, dValue);
                }

                curNode.insertItem(tempItem);
        }

        public void split(Node node)
        {
                DataItem itemB, itemC;
                Node parent, child2, child3;
                int itemIndex;

                itemC = node.removeItem();
                itemB = node.removeItem();
                child2 = node.disconnectChild(2);
                child3 = node.disconnectChild(3);

                Node newRight = new Node();

                if(node == root)
                {
                      root = new Node();
                      parent = root;
                      parent.connectChild(0, node);
                }
                else
                      parent = node.getParent();

                itemIndex = parent.insertItem(itemB);
                int n = parent.getNumItems();

                for(int i = n; i > itemIndex; i--)
                {
                      Node temp = parent.disconnectChild(i);
                      parent.connectChild(i + 1, temp);
                }

                parent.connectChild(itemIndex + 1, newRight);

                newRight.insertItem(itemC);
                newRight.connectChild(0, child2);
                newRight.connectChild(1, child3);
        }

        public Node getNextChild(Node node, Long value)
        {
                int i;
                int numItems = node.getNumItems();

                for(i = 0; i < numItems; i++)
                {
                        if(value < node.getItem(i).dData)
                              break;
                }

                return node.getChild(i);
        }

        public void displayTree()
        {
                recDisplayTree(root, 0, 0);
        }

        private void recDisplayTree(Node node, int level, int childNumber)
        {
                System.out.printf("Level: %d, Child: %d ",
                     level, childNumber);
                node.displayNode();

                int numItems = node.getNumItems();
                for(int i = 0; i < numItems + 1; i++)
                {
                       Node nextNode = node.getChild(i);
                       if(nextNode != null)
                           recDisplayTree(nextNode, level + 1, i);
                       else
                           return;
                }

        }
}

public class Tree234App
{
        public static void main(String[] args)
        {
               Scanner input = new Scanner(System.in);
               long value;
               Tree234 theTree = new Tree234();

               theTree.insert(50);
               theTree.insert(40);
               theTree.insert(60);
               theTree.insert(30);
               theTree.insert(70);

               while(true)
               {
                      System.out.println("Enter first letter of show, " +
                          "insert, or find: ");
                      char choice = input.next().charAt(0);

                      switch(choice)
                      {
                             case 's':
                                   theTree.displayTree();
                                   break;
                             case 'i':
                                   System.out.println("Enter value to insert: ");
                                   value = input.nextLong();
                                   theTree.insert(value);
                                   break;
                             case 'f':
                                   System.out.println("Enter value to find: ");
                                   value = input.nextLong();
                                   int found = theTree.find(value);

                                   if(found != -1)
                                       System.out.printf("%d is found%n", value);
                                   else
                                       System.out.printf("%d is not found%n", value);
                      }
               }
        }
}
