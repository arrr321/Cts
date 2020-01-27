package com.servelet;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class League {


	private String leagueId;
	private String leagueName;
	private String leagueYear;
	private String leagueSeason;
	public String getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getLeagueYear() {
		return leagueYear;
	}
	public void setLeagueYear(String leagueYear) {
		this.leagueYear = leagueYear;
	}
	public String getLeagueSeason() {
		return leagueSeason;
	}
	public void setLeagueSeason(String leagueSeason) {
		this.leagueSeason = leagueSeason;
	}
	public League(String leagueId, String leagueName, String leagueYear, String leagueSeason) {
		super();
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.leagueYear = leagueYear;
		this.leagueSeason = leagueSeason;
	}
	@Override
	public String toString() {
		return "League [leagueId=" + leagueId + ", leagueName=" + leagueName + ", leagueYear=" + leagueYear
				+ ", leagueSeason=" + leagueSeason + "]";
	}
	
	
	
}
