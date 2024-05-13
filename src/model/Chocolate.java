package model;

import java.util.Objects;

public class Chocolate {

	private Double volume;
	
	public Chocolate() {
		super();
	}

	public Chocolate(Double volume) {
		this.volume = volume;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public double weight() {
		if(volume >= 50 && volume <= 60) {
			return 60.0;
		}
		if(volume >= 100 && volume <= 110) {
			return 115.0;
		}
		if(volume >= 150 && volume <= 165) {
			return 160.0;
		}
		if(volume >= 200 && volume <= 220) {
			return 215.0;
		}
		if(volume >= 260 && volume <= 280) {
			return 280.0;
		}
		return 0.0;
	}

	@Override
	public int hashCode() {
		return (int)((weight() / 5)/10) - 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Objects.equals(volume, other.volume);
	}
	
}
