package com.sahabt.library.domain.borrow;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Punishment {

	private int punishmentAmount;

	public static Punishment of(int punishmentAmount) {
		return new Punishment(punishmentAmount);
	}
	private Punishment(int punishmentAmount) {
		super();
		this.punishmentAmount = punishmentAmount;
	}

	public int getPunishmentAmount() {
		return punishmentAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(punishmentAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punishment other = (Punishment) obj;
		return punishmentAmount == other.punishmentAmount;
	}

	@Override
	public String toString() {
		return "Punishment [punishmentAmount=" + punishmentAmount + "]";
	}
	
	
	
}
