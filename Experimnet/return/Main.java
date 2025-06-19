class Main{
    public static int demo(){
        try{
            return 10;
        }
        finally{
            return 20;
        }
    }
    public static void main(String args[]){
        System.out.println(demo());
    }
}