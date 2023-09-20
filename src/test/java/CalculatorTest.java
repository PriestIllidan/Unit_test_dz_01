import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Calculator.calculateDiscount;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(calculateDiscount(10, 0.5)).isEqualTo(5);
        try {
            calculateDiscount(3, 0);

        } catch (ArithmeticException e){
            System.out.println("Enter correct values");
            System.out.printf("Сумма после скидки : %s\n", calculateDiscount(3, 0.3));
        }
    }
}
