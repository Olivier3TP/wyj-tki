public class StosWyjatkow {
    public void metoda1(){
        System.out.println("metoda 1");
        metoda2();
    }
    public void metoda2(){
        System.out.println("metoda 2");
        metoda3();
    }
    public void metoda3(){
        System.out.println("metoda 3");
        metoda4();
    }
    public void metoda4(){
        System.out.println("metoda 4");
        throw new RuntimeException("BUM BUM BUM");
    }


}
