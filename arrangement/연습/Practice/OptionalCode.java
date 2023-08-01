package 연습.Practice;

import java.util.Optional;

public class OptionalCode {

    public Optional<String> getNameById(int id) {
        // id에 해당하는 이름이 있다면 Optional로 감싸서 반환합니다.
        // 없다면 빈 Optional 객체를 반환합니다.
        if (id == 1) {
            return Optional.of("John");
        } else if (id == 2) {
            return Optional.of("Mary");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        OptionalCode example = new OptionalCode();

        // getNameById() 메서드를 호출하여 Optional 객체를 반환받습니다.
        Optional<String> nameOptional = example.getNameById(1);

        // isPresent() 메서드를 사용하여 값이 존재하는지 확인합니다.
        if (nameOptional.isPresent()) {
            // get() 메서드를 사용하여 Optional 객체에 저장된 값을 반환합니다.
            String name = nameOptional.get();
            System.out.println("Name: " + name);
        } else {
            System.out.println("Name not found");
        }

        // orElse() 메서드를 사용하여 기본값을 반환받습니다.
        String defaultName = nameOptional.orElse("Unknown");
        System.out.println("Default name: " + defaultName);

        // orElseGet() 메서드를 사용하여 콜백 함수를 실행하여 값을 반환받습니다.
        String nameFromCallback = nameOptional.orElseGet(() -> {
            System.out.println("Callback function called");
            return "Unknown";
        });
        System.out.println("Name from callback: " + nameFromCallback);

        // filter() 메서드를 사용하여 조건에 맞는 값을 반환받습니다.
        Optional<String> filteredOptional = nameOptional.filter(name -> name.length() > 3);
        if (filteredOptional.isPresent()) {
            String filteredName = filteredOptional.get();
            System.out.println("Filtered name: " + filteredName);
        } else {
            System.out.println("Filtered name not found");
        }

        // map() 메서드를 사용하여 Optional 객체에 저장된 값을 변환합니다.
        Optional<Integer> lengthOptional = nameOptional.map(name -> name.length());
        if (lengthOptional.isPresent()) {
            Integer length = lengthOptional.get();
            System.out.println("Name length: " + length);
        } else {
            System.out.println("Name length not found");
        }

        // flatMap() 메서드를 사용하여 Optional 객체에 저장된 값을 다른 Optional 객체로 변환합니다.
        Optional<String> flatMappedOptional = nameOptional.flatMap(name -> Optional.of(name.toUpperCase()));
        if (flatMappedOptional.isPresent()) {
            String flatMappedName = flatMappedOptional.get();
            System.out.println("Flat mapped name: " + flatMappedName);
        } else {
            System.out.println("Flat mapped name not found");
        }
    }
}
