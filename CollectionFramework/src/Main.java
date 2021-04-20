public class Main {
    public static void main(String[] args) {
        Product pd1 = new Product("Iphone 5",10,2000000);
        Product pd2 = new Product("Iphone 6",11,300000);
        Product pd3 = new Product("Iphone 8",13,5000000);
        Product pd4 = new Product("Iphone 9",14,6000000);
        Product pd5 = new Product("Iphone 7",12,4000000);
        ProductManager pdm = new ProductManager();
        pdm.add(pd1);
        pdm.add(pd2);
        pdm.add(pd3);
        pdm.add(pd4);
        pdm.add(pd5);
        pdm.sortProduct();
        pdm.display();
        System.out.println("===============");
        pdm.edit(12,new Product("Iphone X",17,1000000));
        pdm.remove(13);
        pdm.sortProduct();
        pdm.display();
        System.out.println("+++++++++");
        pdm.searchProduct("Iphone 5");
    }
}
