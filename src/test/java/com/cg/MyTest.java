package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.aditi.IStudent;
import com.aditi.StudentDao;

@RunWith(MockitoJUnitRunner.class)
public class MyTest {
@Mock
	IStudent std;
@InjectMocks	
StudentDao dao;
	
@Test
public void test1() {
	when(std.getMarks(5)).thenReturn(90);
	assertEquals("Pass", dao.getResult(std, 5));
	
}


}



