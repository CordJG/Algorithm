package checkpoint.products;

import java.util.Scanner;

public class Coffee extends Product {

    private boolean additionalShot;

    public Coffee(int id, String name, int price, boolean additionalShot) {
        super(id, name, price);
        this.additionalShot = additionalShot;
    }

    private void setAdditionalShot(boolean additionalShot) {
        this.additionalShot = additionalShot;
    }

    @Override
    public void applyOption() {

        System.out.println("샷을 추가하시겠습니까? (1)_예 (2)_아니오");

        Scanner scanner = new Scanner(System.in);

        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) setAdditionalShot(true);
    }

    @Override
    public String getOptionToString() {
        return additionalShot ? "(샷 추가)" : "";
    }
}
