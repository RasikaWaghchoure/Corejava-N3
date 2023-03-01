package org.tnsif.application;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public GsPrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, boolean isPrime) 
	{
		GsPrimeAcc g=new GsPrimeAcc(accno,accnm,charges,isPrime);
		return g;
		
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accno, String accnm, float charges, float deliveryCharges) {
		
		GSNormalAcc n=new GSNormalAcc(accno,accnm,charges,deliveryCharges);
		return n;
		
		
	}

	
		
	}
	

