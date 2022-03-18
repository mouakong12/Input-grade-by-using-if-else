import java.util.Scanner;
public class TestScore{
    public static void main(String[] args){
        int testScore ;
        System.out.println("input grade : ");
        Scanner sc = new Scanner(System.in);
        testScore = sc.nextInt();
        if((testScore>90)&&(testScore<=100)){
            System.out.println("Grade A");
        }else if((testScore>80)&&(testScore<=90)){
            System.out.println("Grade B+");
        }else if((testScore>70)&&(testScore<=80)){
            System.out.println("Grade B");
        }else if((testScore>60)&&(testScore<=70)){
            System.out.println("Grade C+");
        }else if((testScore>50)&&(testScore<=60)){
            System.out.println("Grade C");
        }else if(testScore==50){
            System.out.println("Grade D");
        }else if((testScore>=0)&&(testScore<50)){
            System.out.println("Grade F");
        }

    }
}