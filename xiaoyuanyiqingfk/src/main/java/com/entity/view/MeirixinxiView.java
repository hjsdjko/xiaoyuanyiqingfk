package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.MeirixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 每日信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("meirixinxi")
public class MeirixinxiView extends MeirixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 信息类型的值
	*/
	@ColumnInfo(comment="信息类型的字典表值",type="varchar(200)")
	private String meirixinxiValue;




	public MeirixinxiView() {

	}

	public MeirixinxiView(MeirixinxiEntity meirixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, meirixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 信息类型的值
	*/
	public String getMeirixinxiValue() {
		return meirixinxiValue;
	}
	/**
	* 设置： 信息类型的值
	*/
	public void setMeirixinxiValue(String meirixinxiValue) {
		this.meirixinxiValue = meirixinxiValue;
	}




	@Override
	public String toString() {
		return "MeirixinxiView{" +
			", meirixinxiValue=" + meirixinxiValue +
			"} " + super.toString();
	}
}
