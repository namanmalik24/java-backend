class type_conversion{
        public static void main(String args[]){
            byte b=127;
            int a =12;
            b= (byte) a; //explicit type conversion

            System.out.println(a);
            System.out.println(b);

            int t=5;

            if(t>0)
            {
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
}