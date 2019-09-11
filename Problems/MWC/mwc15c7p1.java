import java.io.*;
import java.util.*;

public class mwc15c7p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double arr[] = new double[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextDouble();
        }
        boolean arit = true;
        for(int i=2; i<a; i++){
            if(arr[i]-arr[i-1]!=arr[i-1]-arr[i-2]){
                arit = false;
                break;
            }
        }boolean geo = true;
        for(int i=2; i<a; i++){
            if(arr[i]==0){
                break;
            }
            if(arr[i]/arr[i-1]!=arr[i-1]/arr[i-2]){
                geo = false;
                break;
            }
        }if(arit&&geo){
            System.out.println("both");
        }else if(arit){
            System.out.println("arithmetic");
        }else if(geo){
            System.out.println("geometric");
        }else{
            System.out.println("random");
        }
    }
}