// cate numere pare sau impare avem
public class par {
    public static void main(String[] args) {
  int a = 0;
  int r=0;
for(int i=1; i<=10; i++){
    if(i%2==0){
        a++;
    }
    else {
        r++;
    }
}
    System.out.println("avem "+a+" numere pare");
    System.out.println("avem "+r+" numere impare");
}
}
