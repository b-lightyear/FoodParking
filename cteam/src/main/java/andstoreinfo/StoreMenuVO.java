package andstoreinfo;

public class StoreMenuVO {
	private int menu_id, store_code, menu_code, price, id, menu_cnt;
    private String menu_image, menu_name, store_image;

    
    
    
    public int getMenu_cnt() {
		return menu_cnt;
	}

	public void setMenu_cnt(int menu_cnt) {
		this.menu_cnt = menu_cnt;
	}

	public String getStore_image() {
		return store_image;
	}

	public void setStore_image(String store_image) {
		this.store_image = store_image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public int getStore_code() {
        return store_code;
    }

    public void setStore_code(int store_code) {
        this.store_code = store_code;
    }

    public int getMenu_code() {
        return menu_code;
    }

    public void setMenu_code(int menu_code) {
        this.menu_code = menu_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMenu_image() {
        return menu_image;
    }

    public void setMenu_image(String menu_image) {
        this.menu_image = menu_image;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }
}
