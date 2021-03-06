package com.usee.dao;

import java.util.List;

import com.usee.moddel.Danmu;

public interface DanmuDao {

	public void saveDanmu(Danmu message);

	public List<Danmu> getDanmuList(String topicId);

	public Danmu getDanmu(String messageId);
	public  List<Danmu> getDanmuList(String topicId, int pageNum,
			int pageSize);
}
