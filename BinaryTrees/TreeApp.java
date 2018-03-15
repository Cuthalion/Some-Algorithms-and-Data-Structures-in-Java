import java.util.*; // for Stack class

class Node
{
        public int iData; // key data item
        public double dData; // data item
        public Node leftChild;
        public Node rightChild;

        public Node(int iData, double dData)
        {
               this.iData = iData;
               this.dData = dData;
        }
        public void displayNode()
        {
               System.out.printf("{%d, %f}", iData, dData);
        }
}

class Tree
{
        public Node root;

        public Tree()
        {
               root = null;
        }

        public Node find(int key)
        {
               Node current = root;

               while(key != current.iData)
               {
                    if(key < current.iData)
                         current = current.leftChild;
                    else
                         current = current.rightChild;
                    if(current == null)
                         return null;
               }

               return current;
      }

      public void insert(int iData, double dData)
      {
               Node newNode = new Node(iData, dData);

               if(root == null)
                    root = newNode;
               else
               {
                    Node parent;
                    Node current = root;

                    while(true)
                    {
                          parent = current;

                          if(iData < current.iData)
                          {
                                 current = current.leftChild;
                                 if(current == null)
                                 {
                                       parent.leftChild = newNode;
                                       return;
                                 }
                          }
                          else
                          {
                                 current = current.rightChild;
                                 if(current == null)
                                 {
                                        parent.rightChild = newNode;
                                        return;
                                 }
                          }

                    }
               }
      }

      public boolean delete(int key)
      {
               Node current = root;
               Node parent = root;
               boolean isLeftChild = true;

               while(current.iData != key)
               {
                     parent = current;

                     if(key < current.iData)
                     {
                            current = current.leftChild;
                            isLeftChild = true;
                     }

                     else
                     {
                            current = current.rightChild;
                            isLeftChild = false;
                     }

                     if(current == null)
                            return false;
               }

               if(current.leftChild == null && // if no children simply delete
                       current.rightChild == null)
               {
                       if(current == root)
                            root = null;
                       else
                            if(isLeftChild)
                                  parent.leftChild = null;
                            else
                                  parent.rightChild = null;
               }

               // if no right child, replace with left subtree
               else if(current.rightChild == null)
               {
                       if(current == root)
                            root = current.leftChild;
                       else
                            if(isLeftChild)
                                  parent.leftChild = current.leftChild;
                            else
                                  parent.rightChild = current.leftChild;
               }

               // if no left child, replace with right subtree
               else if(current.leftChild == null)
               {
                       if(current == root)
                            root = current.rightChild;
                       else
                            if(isLeftChild)
                                  parent.leftChild = current.rightChild;
                            else
                                  parent.rightChild = current.rightChild;
               }

               else
               {
                       Node successor = getSuccessor(current);

                       if(current == root)
                            root = successor;
                       else
                            if(isLeftChild)
                                  parent.leftChild = successor;
                            else
                                  parent.rightChild = successor;

                       successor.leftChild = current.leftChild;
               }

               return true;
      }

      public Node getSuccessor(Node delNode)
      {
               Node successorParent = delNode;
               Node successor = delNode;
               Node current = delNode.rightChild;

               while(current != null)
               {
                      successorParent = successor;
                      successor = current;
                      current = current.leftChild;
               }

               if(successor != delNode.rightChild)
               {
                      successorParent.leftChild = successor.rightChild;
                      successor.rightChild = delNode.rightChild;
               }

               return successor;
      }

      public void traverse(int traverseType)
      {
               switch(traverseType)
               {
                     case 1 : System.out.print("\nPreorder traversal: ");
                              preOrder(root);
                              break;
                     case 2 : System.out.print("\nInorder traversal: ");
                              inOrder(root);
                              break;
                     case 3 : System.out.print("\nPostorder traversal: ");
                              postOrder(root);
                              break;
                     default : System.out.print("Wrong input");
               }

               System.out.println();
      }

      private void preOrder(Node localRoot)
      {
               if(localRoot != null)
               {
                      System.out.printf("%d ", localRoot.iData);
                      preOrder(localRoot.leftChild);
                      preOrder(localRoot.rightChild);
               }
      }

      private void inOrder(Node localRoot)
      {
               if(localRoot != null)
               {
                      inOrder(localRoot.leftChild);
                      System.out.printf("%d ", localRoot.iData);
                      inOrder(localRoot.rightChild);
               }
      }

      private void postOrder(Node localRoot)
      {
               if(localRoot != null)
               {
                      postOrder(localRoot.leftChild);
                      postOrder(localRoot.rightChild);
                      System.out.printf("%d ", localRoot.iData);
               }
      }

      public void displayTree()
      {
               Stack<Node> globalStack = new Stack<Node>();
               globalStack.push(root);
               int nBlanks = 32;
               boolean isRowEmpty = false;
               System.out.println(
               "...................................................................");

               while(isRowEmpty == false)
               {
                      Stack<Node> localStack = new Stack<Node>();
                      isRowEmpty = true;

                      for(int i = 0; i < nBlanks; i++)
                            System.out.print(" ");

                      while(globalStack.isEmpty() == false)
                      {
                            Node temp = (Node)globalStack.pop();
                            if(temp != null)
                            {
                                   System.out.print(temp.iData);
                                   localStack.push(temp.leftChild);
                                   localStack.push(temp.rightChild);

                                   if(temp.leftChild != null ||
                                           temp.rightChild != null)
                                           isRowEmpty = false;
                            }
                            else
                            {
                                   System.out.print("--");
                                   localStack.push(null);
                                   localStack.push(null);
                            }

                            for(int i = 0; i < nBlanks * 2 - 2; i++)
                                   System.out.print(" ");

                      }

                      System.out.println();
                      nBlanks /= 2;
                      while(localStack.isEmpty() == false)
                             globalStack.push(localStack.pop());
               }

               System.out.println();

      }

}

public class TreeApp
{
      public static void main(String[] args)
      {
              int value;
              Tree theTree = new Tree();
              Scanner input = new Scanner(System.in);

              theTree.insert(50, 1.5);
              theTree.insert(25, 1.2);
              theTree.insert(75, 1.7);
              theTree.insert(12, 1.5);
              theTree.insert(37, 1.2);
              theTree.insert(43, 1.7);
              theTree.insert(30, 1.5);
              theTree.insert(33, 1.2);
              theTree.insert(87, 1.7);
              theTree.insert(93, 1.5);
              theTree.insert(97, 1.5);

              while(true)
              {
                     System.out.print(
                          "Enter first letter of show, insert, find, delete, " +
                          "or traverse: ");
                     int choice =  input.next().charAt(0);

                     switch(choice)
                     {
                           case 's' :
                                 theTree.displayTree();
                                 break;
                           case 'i' :
                                 System.out.println("Enter value to insert: ");
                                 value = input.nextInt();
                                 theTree.insert(value, value + 0.9);
                                 break;
                           case 'f':
                                 System.out.println("Enter value to find: ");
                                 value = input.nextInt();
                                 Node found = theTree.find(value);

                                 if(found != null)
                                 {
                                       System.out.print("Found: ");
                                       found.displayNode();
                                       System.out.println();
                                 }
                                 else
                                 {
                                       System.out.printf("%d couldn't find%n",
                                            value);
                                 }
                                 break;
                           case 'd':
                                 System.out.println("Enter value to delete: ");
                                 value = input.nextInt();
                                 boolean isDeleted = theTree.delete(value);
                                 if(isDeleted)
                                      System.out.printf("%d is deleted%n",
                                           value);
                                 else
                                      System.out.printf("%d is not deleted%n",
                                           value);
                                 break;
                            case 't':
                                  System.out.printf("Enter 1, 2 or 3 for "+
                                  "preorder, inorder and post order " +
                                  "traversals respectively");
                                  value = input.nextInt();
                                  theTree.traverse(value);
                                  break;
                            default:
                                  System.out.println("Invalid entry");
                     }
              }
      }
}
