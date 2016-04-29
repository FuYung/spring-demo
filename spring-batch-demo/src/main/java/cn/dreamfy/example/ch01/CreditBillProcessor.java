package cn.dreamfy.example.ch01;

import cn.dreamfy.example.ch01.model.CreditBill;
import org.springframework.batch.item.ItemProcessor;

import java.util.Random;

/**
 * CreditBillProcessor
 * Created by vicfu on 2015/12/30.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {

	Random random = new Random();

	@Override
	public CreditBill process(CreditBill item) throws Exception {

		int i = random.nextInt(10) +1;

		System.out.println("Processing... Item:" + item.toString() + " random i=" + i);
		if (i % 2 == 0) {
			System.out.println("make error RuntimeException...");
			throw new RuntimeException("error");
		}
		return item;
	}
}
