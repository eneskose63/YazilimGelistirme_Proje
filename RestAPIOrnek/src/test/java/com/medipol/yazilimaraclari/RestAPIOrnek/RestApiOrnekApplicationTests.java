package com.medipol.yazilimaraclari.RestAPIOrnek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.medipol.yazilimaraclari.RestAPIOrnek.OgrenciRESTAPI.Ogrenci;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApiOrnekApplicationTests {

	@Test
	public void contextLoads() {
	}
/*
	@Test
	public void ekle() {
		OgrenciRESTAPI x =new OgrenciRESTAPI();
		  assertEquals("Ali", 25 ,x.ekle(null));
	}
	
	private static List<Ogrenci> ogrenciListesi  =new ArrayList<>();
    @Test
    public void OgrenciEkle()
    {
        OgrenciRESTAPI add=new OgrenciRESTAPI();

        ogrenciListesi=(List<Ogrenci>) add.ekle(new Ogrenci("Ayse",21));
        Ogrenci sonuc=(Ogrenci) ogrenciListesi;
        assertEquals("Ayse",21,sonuc);

    }
*/

	
}
