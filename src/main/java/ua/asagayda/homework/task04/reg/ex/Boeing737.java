package ua.asagayda.homework.task04.reg.ex;

public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }



    private static class Drawing {

        private int id;

        public Drawing(int id) {
            return;
        }

        public static int getPassengersCount() {

            return maxPassengersCount;
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }

        public static void main(String[] args) {

            for (int i = 1; i < 6; i++) {

                Boeing737.Drawing drawing = new Boeing737.Drawing(i);
                System.out.println(drawing);
            }
        }
    }
}
