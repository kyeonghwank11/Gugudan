package chap;

public class Car {
    public Car() { }   // 기본 생성자 자동 추가
}
    Car myCar = new Car();  // 기본 생성자 호출

public class Car {
    // 생성자 선언
    Car(String model, String Color, int maxSpeed) { ... }
}
public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);
    }
}
public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean (String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

public class KoreanExam {
    public static void main(String[] args) {
        Korean kr1 = new Korean("자바", "000000-0000000");
        System.out.println(kr1.name);
        System.out.println(kr1.ssn);

        System.out.println();

        Korean kr2 = new Korean("Java", "111111-1111111");
        System.out.println(kr2.name);
        System.out.println(kr2.ssn);
    }
}

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model) {
        this(model, "은색", 250);
    }
    Car(String model, String color) {
        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println();

        Car car2 = new Car("자가용", "빨강");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);

        Car car3 = new Car("자가용", "빨강", 200);
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);
    }
}