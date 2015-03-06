package com.gavin.bean;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import com.gavin.interfaces.Instrument;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 一人乐队
 * 装配集合
 */
public class OneManBand implements Performer {

	private Collection<Instrument> instruments;
	
	//key中表明了乐器名字
	private Map<String,Instrument> instrumentsMap;
	
	private Properties instrumentsProps;
	
	@Override
	public void perform() {
		/*for (Instrument instrument : instruments) {
			instrument.play();
		}*/
		
		/*for (String key : instrumentsMap.keySet()) {
			System.out.print(key + " : ");
			Instrument ins = instrumentsMap.get(key);
			ins.play();
		}*/
		
		System.out.println(instrumentsProps);
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public void setInstrumentsMap(Map<String, Instrument> instrumentsMap) {
		this.instrumentsMap = instrumentsMap;
	}

	public void setInstrumentsProps(Properties instrumentsProps) {
		this.instrumentsProps = instrumentsProps;
	}

	
	
}
