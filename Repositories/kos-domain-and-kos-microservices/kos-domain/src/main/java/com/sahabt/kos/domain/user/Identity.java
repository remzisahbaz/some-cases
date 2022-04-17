package com.sahabt.kos.domain.user;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class Identity {

	private final String value;
	private final static Map<String,Identity> cache=new ConcurrentHashMap<>();
	
	private Identity(String value) {
		this.value=value;
	}

	static public Identity valueOf(String value) {
		Objects.requireNonNull(value);
		if(!isValid(value))
		{throw new IllegalArgumentException("Bu bir kimlik numarası değil !");}
		
		var cacheIdentity= cache.get(value);
		if(Objects.isNull(cacheIdentity))
		{
		 cacheIdentity= new Identity(value);
		 cache.put(value, cacheIdentity);
			
		}
		return cacheIdentity;
		
	}

	private static boolean isValid(String value2) {
		return false;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identity other = (Identity) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Identity [value=" + value + "]";
	}

	
}
