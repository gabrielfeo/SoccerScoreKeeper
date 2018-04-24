package com.gfeo.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	/** Goals and fouls variables initialization */
	int teamAGoals;
	int teamAFouls;
	int teamBGoals;
	int teamBFouls;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/**Displays initial values i.e. 0 */
		displayTeamAGoals();
		displayTeamAFouls();
		displayTeamBGoals();
		displayTeamBFouls();
	}

	/** Updates the Team A goals counter TextView */
	public void displayTeamAGoals() {
		TextView textViewTeamAGoals = (TextView) findViewById(R.id.text_view_team_a_goals_counter);
		textViewTeamAGoals.setText("" + teamAGoals);
	}

	/** Updates the Team A fouls counter TextView */
	public void displayTeamAFouls() {
		TextView textViewTeamAFouls = (TextView) findViewById(R.id.text_view_team_a_fouls_counter);
		textViewTeamAFouls.setText("" + teamAFouls);
	}

	/** Updates the Team B goals counter TextView */
	public void displayTeamBGoals() {
		TextView textViewTeamBGoals = (TextView) findViewById(R.id.text_view_team_b_goals_counter);
		textViewTeamBGoals.setText("" + teamBGoals);
	}

	/** Updates the Team B fouls counter TextView */
	public void displayTeamBFouls() {
		TextView textViewTeamBFouls = (TextView) findViewById(R.id.text_view_team_b_fouls_counter);
		textViewTeamBFouls.setText("" + teamBFouls);
	}

	/**
	 * This method is called by the counter buttons (- and +) to update their corresponding variable and call their respective "display" method
	 * @param view the Button view that called the method
	 */
	public void changeCounter(View view) {
		switch (view.getId()) {
			case R.id.button_team_a_goals_minus:
				if (teamAGoals == 0) {
					return;
				}
				teamAGoals--;
				displayTeamAGoals();
				break;
			case R.id.button_team_a_goals_plus:
				teamAGoals++;
				displayTeamAGoals();
				break;
			case R.id.button_team_a_fouls_minus:
				if (teamAFouls == 0) {
					return;
				}
				teamAFouls--;
				displayTeamAFouls();
				break;
			case R.id.button_team_a_fouls_plus:
				teamAFouls++;
				displayTeamAFouls();
				break;
			case R.id.button_team_b_goals_minus:
				if (teamBGoals == 0) {
					return;
				}
				teamBGoals--;
				displayTeamBGoals();
				break;
			case R.id.button_team_b_goals_plus:
				teamBGoals++;
				displayTeamBGoals();
				break;
			case R.id.button_team_b_fouls_minus:
				if (teamBFouls == 0) {
					return;
				}
				teamBFouls--;
				displayTeamBFouls();
				break;
			case R.id.button_team_b_fouls_plus:
				teamBFouls++;
				displayTeamBFouls();
				break;
		}
	}

	/** This method assigns the value 0 to all variables and calls all "display" methods
	 * @param view the view that called the method i.e. the Reset Button view */
	public void resetAllCounters(View view) {
		teamAGoals = 0;
		teamAFouls = 0;
		teamBGoals = 0;
		teamBFouls = 0;
		displayTeamAGoals();
		displayTeamAFouls();
		displayTeamBGoals();
		displayTeamBFouls();
	}

}
