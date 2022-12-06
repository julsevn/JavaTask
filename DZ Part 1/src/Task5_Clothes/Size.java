package Task5_Clothes;

public class Size {
    public static void main(String[] args) {


    }

    enum Size1 {
        XXS(32){
            @Override
            public void getDescription(){
                System.out.println("Детский размер");
            }
        },

        XS(34){
            public void getDescription(){
                System.out.println("Взрослый размер");
            }
        },

        S(36){
            public void getDescription(){
                System.out.println("Взрослый размер");
            }
        },

        M(38){
            public void getDescription(){
                System.out.println("Взрослый размер");
            }

        },

        L(40){
            public void getDescription(){
                System.out.println("Взрослый размер");
            }
        };

        private int euroSize;

        Size1(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }


        public abstract void getDescription();
    }




}





