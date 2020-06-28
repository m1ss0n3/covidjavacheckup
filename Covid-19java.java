import java.util.*;

 class Covid19Checkup

 {

   public static void main(String args[])

   { 

    int ara[] = new int[10];

         String name;

         

         Scanner sc = new Scanner(System.in);

         System.out.println("COVID-19 Checkup Java program");

         

         System.out.println("Siapa nama anda");

         name = sc.nextLine();

         System.out.println("Berapa umurmu?\n");

         ara[0] = sc.nextInt();

         System.out.println("Hai "+name+", Apakah kamu demam?\nYa=0,Tidak=1\n");

         ara[1] = sc.nextInt();

         System.out.println("Apakah Anda mengalami gangguan pernapasan?\nYa=0,Tidak=1\n");

         ara[2] = sc.nextInt();

         System.out.println("Apakah Anda batuk??\nYa=0,Tidak=1\n");

         ara[3] = sc.nextInt();

         System.out.println("Apakah kamu merasa lelah?\nYa=0,Tidak=1\n");

         ara[4] = sc.nextInt();

         

             if(ara[1]==0 && ara[2]==0 && ara[3]==0 && ara[4]==0)

    {

        System.out.println("Dear "+name+",\n Anda harus pergi ke klinik dan menguji darah Anda.\n ");

        

    }

    

    else {

        

        System.out.println("Dear "+name+", jika Anda merasa sangat sakit, Pergi ke klinik.\n");

   }

   

   System.out.println("Berdasarkan www.worldometer.info,");

   

   if(ara[0]>=0 && ara[0]<=9){

   

      System.out.println("\n Di usia Anda tingkat fatalitas virus korona adalah 0.00%");

   }

   

   else if(ara[0]>=10 && ara[0]<=19){

      System.out.println("\n Di usia Anda tingkat fatalitas virus korona adalah 0.2%");

      

   }

   

   else if(ara[0]>=20 && ara[0]<=29){

      System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 0.2%");

      }

      

   else if(ara[0]>=30 && ara[0]<= 39){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 0.2%");

      

   }

   

   else if(ara[0]>=40 && ara[0]<=49){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 0.4%");

     

      

   }

   

   else if(ara[0]>=50 && ara[0]<=59){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 1.3%");

      

   }

   

   else if(ara[0]>=60 && ara[0]<=69){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 3.6%");

      

   }

   

   else if(ara[0]>=70 && ara[0]<=79){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 8.0%");

      

   }

   

   else if(ara[0]>=80){

     System.out.println("\nDi usia Anda tingkat fatalitas virus korona adalah 21.8% atau 14.8%");

      

   }

   

   System.out.println("\n\n\nKiat-kiat penting untuk mencegahnya:\n1)Tetap di rumah\n2)Gunakan masker\n3)Selalu cuci tangan setelah ataupun sebelum beraktifitas, \n Atau gunakan alkohol untuk mengusir virus\n  yang mungkin ada di tangan Anda\n");

   System.out.println("Thank you");

   }

 }

