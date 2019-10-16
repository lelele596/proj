package com.company;

public interface IDataAdapter {
    int CONNECTION_OPEN_OK = 100;
    int CONNECTION_OPEN_FAILED = 101;
    int CONNECTION_CLOSE_OK = 200;
    int CONNECTION_CLOSE_FAILED = 201;
    int PRODUCT_SAVED_OK = 0;
    int PRODUCT_DUPLICATE_ERROR = 1;
    int CUSTOMER_SAVED_OK = 0;
    int CUSTOMER_DUPLICATE_ERROR = 1;
    int PURCHASE_SAVED_OK = 0;
    int PURCHASE_DUPLICATE_ERROR = 1;



    public int connect(String dbfile);
    public int disconnect();

    public ProductModel loadProduct(int id);
    public int saveProduct(ProductModel model);

    public CustomerModel loadCustomer(int id);
       public int saveCustomer(CustomerModel model);

    public PurchaseModel loadPurchase(int id);
    public int savePurchase(PurchaseModel model);


}
