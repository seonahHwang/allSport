package com.teamSupport.allSport.Chat;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ChatMessageMapper {
	int selectCount();
	void insertChatMessage(@Param(value = "idChatMessage") int idChatMessage, @Param(value = "type") String type,
			@Param(value = "writer") String writer, @Param(value = "message") String message,
			@Param(value = "idChatRoom") int idChatRoom);
}
