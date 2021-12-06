package Triangl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangle {
    private int a;
    private int b;
    private int c;

 public void checkNotNullSides() {
     if (a <= 0 || b <= 0 || c <= 0) {
         throw new IllegalArgumentException("Стороны должны быть больше нуля.");
     }
    }

    private void chekValid() {
        long max = Math.max(Math.max(a, b), c);
        if (max > (a + b + c - max)) {
            throw new IllegalArgumentException("Сумма 2 сторон должна быть больше длины одной стороны.");
        }
    }

    public int calculatePerimeter() {
     int p = a+b+c;
     return p;
    }

    public int calculateArea() {
     int p = (a+b+c)/2;
     double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
     return p;
    }

    public double calculateHigh() {
     int p = calculatePerimeter()/2;
     double h = ((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*2)/c;
     return h;
    }


}
