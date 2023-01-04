package 연습;

public class PhoneFuntion {


    public static void call(User<? extends Phone> user) {
        System.out.println("-".repeat(20));
        System.out.println("user.phone = " + user.phone.getClass().getSimpleName());

    }
}

class Phone {}

class IPhone extends Phone {}
class Galaxy extends Phone {}

class IPhone12Pro extends IPhone {}
class IPhoneXS extends IPhone {}

class S22 extends Galaxy {}
class ZFlip3 extends Galaxy {}

class User<T> {
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}