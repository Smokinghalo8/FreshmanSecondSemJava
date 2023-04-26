import java.util.*;


public class BinarySeachTester {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(23,17,12,90,84,38,5,77,44));
        System.out.print("Unsorted:");
        for(int n:array){
            System.out.print(n+" ");
        }
        System.out.println();
        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("Sorted Array: ");
        for(int n:array){
            System.out.print(n+" ");
        }
        System.out.println("");

        System.out.println("What Number Do you want to search for? ");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.BinarySearch(key,sortedArray);
        if(found==-1){
            System.err.println("Number Not Found :(");
        } else{
            System.out.println("Found at Index: "+found+" Position: "+found+1+"\n\n");
        }
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> UnsortedArray){
    ArrayList<Integer> temp = UnsortedArray;
    for(int i=0;i<=temp.size()-1;i++){
        int min=i;
        for(int j=i+1;j<=temp.size()-1;j++){
            if(temp.get(j)<temp.get(min)){
                min=j;
            }
        }
        int temp2 =temp.get(i);
        temp.set(i, temp.get(min));
        temp.set(min, temp2);
    }
    return temp;
    }


}
