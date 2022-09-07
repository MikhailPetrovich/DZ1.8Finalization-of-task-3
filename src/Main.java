import java.time.LocalDate;

public class Main {

            public static void main(String[] args) {
                // Доработка задачи №3


                //printMessengerOfDelivery(90);
                System.out.println("tack 3");
                int deliveryDistance = 90;
                System.out.println("Производим расчет доставки: " + printMessengerOfDelivery(deliveryDistance) + "\n");

            }


            private static void printCalculateDeliveryDays(int distance) {
                int start = 20;
                int step = 40;
                int result; //кол во дней
                if (distance < start) {
                    result = 1;
                } else {
                    result = (Math.abs((distance - start) / step) + 2);
                }
                System.out.println("Потребуется для доставки дней: " + result);


            }

            public static String printMessengerOfDelivery(int deliveryDistance) {
                if (deliveryDistance < 20) {
                    return "Потребуется 1 день.";
                } else if (deliveryDistance < 60) {
                    return "Потребуется 2 дня.";
                } else if (deliveryDistance <= 100) {
                    return "Потребуется 3 дня.";
                } else {
                    return "Извините, нет возможности доставить товар .";
                }

            }
        }

