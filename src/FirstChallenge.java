public class FirstChallenge {
    public static void main(String args[]) {

        public class Couch {
            private String brand;
            private String colour;
            private int weight;
        }
        public class Bed {
            private String brand;
            private String colour;
            private int weight;
        }

        public class kitchenTable {
            private String brand;
            private String colour;
            private int weight;
        }

        public class desk {
            private String brand;
            private String colour;
            private int weight;
        }

        public class kitchenSink {
            private String brand;
            private String colour;
            private int weight;
        }
        public class TV {
            private String brand;
            private String colour;
            private int weight;

            //public modifier not allowed - why?
            public void setkitchenTableBrand (){
                kitchenTableBrand = Ikea;
            }

            public void setTVColour (){
                TVColour = black;
            }

            public void setDeskweight (){
                Deskweight = 1.11;
            }
        }
    }
}
}
