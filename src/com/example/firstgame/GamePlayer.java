package com.example.firstgame;

import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

public class GamePlayer extends CCLayer{
	//声明一个精灵对象
	CCSprite player;
	public GamePlayer(){	
		//初始化一个精灵对象
		player=CCSprite.sprite("robot.png");//这里默认找assets文件夹下的文件
		
		CGPoint point=CGPoint.ccp(100, 100);
		//设置图片初始位置
		player.setPosition(point);
		
		//将精灵对象添加到布景层当中
		this.addChild(player);
		
		CGPoint target=CGPoint.ccp(800, 100);
		//(跳跃时间,跳跃的最终位置,跳跃高度,跳跃次数)
		CCJumpTo jump=CCJumpTo.action(3, target, 400, 5);
		//让精灵执行该动作
		player.runAction(jump);
	}
}
