package 버거퀸;

public class Kiosk {

     private ProductRepo productRepo = new ProductRepo();

    public void operate(){

        //

        //메뉴 출력
        System.out.println("# 메뉴");
        System.out.println("-".repeat(count:50));

        for (Product product : productRepo.getProducts()){
            System.out.printf(
                    "(%d) %-15s %d\n");   //% -15 s 여기서 -15만큼하면 좌측으로 붙어서 정렬
        }
        System.out.println("-".repeat(count:50));
        System.out.println("메뉴를 골라주세요.");

        //메뉴를 고르게 하기 -> 입력 받기
        int selectedId = Integer.parseInt(scanner.nextLine());
        Product selecteProduct = productRepository.findById(selectedId);

        //옵션 묻고 적용하기
        //1. 상품에 따라 적절한 옵션을 물어봐주기
        //2. 사용자가

        //할인 여부 묻고 적용하기

        //주문 내역 출력하기
    }
}
