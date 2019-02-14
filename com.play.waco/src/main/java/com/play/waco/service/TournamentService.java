package com.play.waco.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.play.waco.dto.TournamentDto;
import com.play.waco.entity.Tournament;
import com.play.waco.repository.TournamentMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class TournamentService {

	private TournamentMapper tournamentMapper;
	
	/*
	 * tournament create
	 */
	public void tournamentCreate(TournamentDto dto) {
		
		List<Tournament> playerList = new ArrayList<Tournament>();
		playerList = tournamentMapper.selectMatchPlayerInfo(dto.toEntity());

		tournamentMap(playerList);
		/*
		for( Tournament player : playerList ) {
			log.info("playerid : {}", player.getPlayerid());
		}
		*/
		
	}

	/*
	 * mapping process
	 * out put : boolean
	 */
	public void tournamentMap(List<Tournament> playerList) {

		/* GYM 별 선수 분리 후 저장할 List */
		Map<Integer, List<Tournament>> playerForGYM = new HashMap<Integer, List<Tournament>>();
		List<Tournament> tempPlayer = null;
		
		/* for문에서 사용하는 List index 변수 */
		int i = 0;
		int arrayNo = 0;
		int mapKey = 0;
		
		/*
		 * DB에서 GYMID(체육관 id)와 WEIGHT_DIVISION(체급) 으로 sort : asc
		 * List => Map으로 GYM 별로 분리
		 */
		for( Tournament player : playerList ) {

			if( arrayNo != player.getGymid() ) {

				if( arrayNo != 0 ) {

					playerForGYM.put(mapKey, tempPlayer);
					mapKey++;

				}

				tempPlayer = new ArrayList<Tournament>();
				
			} 

			i++;
			tempPlayer.add(player);

			if( i == playerList.size() ) {
				playerForGYM.put(mapKey, tempPlayer);
			}
			
			arrayNo = player.getGymid();

		}

	}
	
}
