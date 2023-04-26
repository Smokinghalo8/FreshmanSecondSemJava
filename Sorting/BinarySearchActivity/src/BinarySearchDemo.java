import java.util.ArrayList;

public class BinarySearchDemo {

    public int BinarySearch(int key, ArrayList<Integer> array){
    int counter=0;
    int low = 0;
    int high = array.size();
    int mid = (low+high)/2;

    System.out.println("Pass: "+counter);
    for(int n:array){
        System.out.println(n+" ");
    }

    System.out.println("Low Index: "+low+" "+array.get(low)+" Mid Index: "+mid+" "+ array.get(mid)+" High Index: "+high+" "+array.get(high-1));
    while(low<=high&&array.get(mid)!=key){
        if(array.get(mid)<key){
            low=mid+1;
        } else{
            high=mid+1;
        }
        mid=(low+high)/2;
        System.out.println("Pass: "+counter);

        for(int i=low;i<=high;i++){
            System.out.println(array.get(i)+" ");
        }
        System.out.println("Low Index: "+low+" "+array.get(low)+" Mid Index: "+mid+" "+ array.get(mid)+" High Index: "+high+" "+array.get(high));

    }
    if(low>high){
        mid-=1;
    }
    return mid;

    }

}
