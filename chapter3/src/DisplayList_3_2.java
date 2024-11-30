public class DisplayList_3_2{
public static void main(String[] args) {
    String[] bookNames = {"李尔王","麦克白","日瓦戈医生","战争与和平"};
    int bookIndex = 0;
    do {
        System.out.print(bookNames[bookIndex]+ "\t");
        if(bookIndex%10 == 9) {
            System.out.print("\n");
        }
        bookIndex++;
    }while(bookIndex<50);
}
}
