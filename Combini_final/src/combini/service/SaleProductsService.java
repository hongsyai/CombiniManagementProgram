package combini.service;

import java.util.List;

import combini.dao.SaleProductsDAO;
import combini.vo.Join;

public class SaleProductsService {
	
	SaleProductsDAO dao = new SaleProductsDAO();
	
	// ���� ��ǰ ��ȸ
	public List<Join> selectSaleProducts(String saleDate) {
		return dao.selectSaleProducts(saleDate);
	}

}
