package com.gameslist.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameslist.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
