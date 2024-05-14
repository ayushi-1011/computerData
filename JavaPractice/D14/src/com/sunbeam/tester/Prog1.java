package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.BatchDao;
import com.sunbeam.entity.Batch;

public class Prog1{
public static void main(String[] args) throws Exception {
	try(BatchDao batchDao = new BatchDao()){
		try (Scanner sc = new Scanner(System.in)) {
			Batch batch = new Batch();
			System.out.print("Enter name - ");
			batch.setName(sc.next());
			System.out.print("Enter course - ");
			batch.setCourse(sc.next());
			batchDao.insertBatch(batch);
			System.out.println("Batch Added Successfully");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

}
