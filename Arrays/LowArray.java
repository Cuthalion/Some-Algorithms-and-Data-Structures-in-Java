//demonstrates array class with low-level interface
public class LowArray{

    private int[] n;

		public LowArray(int size){
		    n = new int[size];
		}

		public void setElement(int index, int elem){
		    n[index] = elem;
		}

		public int getElement(int index){
		    return n[index];
		}

		public int getElementCounter(){
		    return elemCounter;
		}
}
