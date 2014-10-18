package com.example.firstgame;

import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

public class GamePlayer extends CCLayer{
	//����һ���������
	CCSprite player;
	public GamePlayer(){	
		//��ʼ��һ���������
		player=CCSprite.sprite("robot.png");//����Ĭ����assets�ļ����µ��ļ�
		
		CGPoint point=CGPoint.ccp(100, 100);
		//����ͼƬ��ʼλ��
		player.setPosition(point);
		
		//�����������ӵ������㵱��
		this.addChild(player);
		
		CGPoint target=CGPoint.ccp(800, 100);
		//(��Ծʱ��,��Ծ������λ��,��Ծ�߶�,��Ծ����)
		CCJumpTo jump=CCJumpTo.action(3, target, 400, 5);
		//�þ���ִ�иö���
		player.runAction(jump);
	}
}
