// prosusul si suma numerelor pare si a numerelor impare
public class par2 {
      public static void main(String[] args) {
  int sumap= 0;
  int prodp=1;
  int sumai= 0;
  int prodi=1;
for(int i=1; i<=10; i++){
    if(i%2==0){
        sumap=sumap+i;
        prodp=prodp*i;
    }
    else {
       sumai=sumai+i;
       prodi=prodi*i;
    }
}
    System.out.println("produsul celor pare este "+prodp+" si suma celor pare este "+sumap);
    System.out.println("produsul celor impare este "+prodi+" si suma celor impare este "+sumai);
}
}
