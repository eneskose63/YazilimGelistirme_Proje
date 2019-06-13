package com.medipol.yazilimaraclari.RestAPIOrnek;
import java.util.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(path="/ogrenci")

public class OgrenciRESTAPI {
	
private static List<Ogrenci> ogrenciList  =new ArrayList<>();
static {
	ogrenciList.add(new Ogrenci("enes",28));
	ogrenciList.add(new Ogrenci("nesim",20));
}


public static class Ogrenci{
	private String ad;
	private int numara;
	public Ogrenci(String ad,int numara) {
		this.ad=ad;
		this.numara=numara;
	}
	public String getIsim() {return ad;}
	public int getNumara() {return numara;}
}
//@GetMapping(path="/listele",produces ="application/json")
@RequestMapping(path="listele",method=RequestMethod.GET)
public List<Ogrenci> listele(){
	return ogrenciList;
}

@RequestMapping(path="/ekle",	method=RequestMethod.POST)
public Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
	ogrenciList.add(ogrenci);
	return ogrenci;
}


}
