package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 师生健康
 *
 * @author 
 * @email
 */
@TableName("guanliliuy")
public class GuanliliuyEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuanliliuyEntity() {

	}

	public GuanliliuyEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 防疫人员
     */
    @ColumnInfo(comment="防疫人员",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 姓名
     */
    @ColumnInfo(comment="姓名",type="varchar(200)")
    @TableField(value = "guanliliuy_name")

    private String guanliliuyName;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身份
     */
    @ColumnInfo(comment="身份",type="int(200)")
    @TableField(value = "guanliliuy_types")

    private Integer guanliliuyTypes;


    /**
     * 院系
     */
    @ColumnInfo(comment="院系",type="int(200)")
    @TableField(value = "yuanxi_types")

    private Integer yuanxiTypes;


    /**
     * 当天体温
     */
    @ColumnInfo(comment="当天体温",type="decimal(10,2)")
    @TableField(value = "guanliliuy_tiwen")

    private Double guanliliuyTiwen;


    /**
     * 有无咳嗽
     */
    @ColumnInfo(comment="有无咳嗽",type="int(200)")
    @TableField(value = "keshou_types")

    private Integer keshouTypes;


    /**
     * 有无外出
     */
    @ColumnInfo(comment="有无外出",type="int(200)")
    @TableField(value = "wuaichu_types")

    private Integer wuaichuTypes;


    /**
     * 外出地点
     */
    @ColumnInfo(comment="外出地点",type="varchar(200)")
    @TableField(value = "guanliliuy_didian")

    private String guanliliuyDidian;


    /**
     * 是否接触病患
     */
    @ColumnInfo(comment="是否接触病患",type="int(200)")
    @TableField(value = "binghuan_types")

    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */
    @ColumnInfo(comment="是否出入高风险区域",type="int(200)")
    @TableField(value = "gaofengxian_types")

    private Integer gaofengxianTypes;


    /**
     * 健康情况详情
     */
    @ColumnInfo(comment="健康情况详情",type="longtext")
    @TableField(value = "guanliliuy_content")

    private String guanliliuyContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：防疫人员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：防疫人员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：姓名
	 */
    public String getGuanliliuyName() {
        return guanliliuyName;
    }
    /**
	 * 设置：姓名
	 */

    public void setGuanliliuyName(String guanliliuyName) {
        this.guanliliuyName = guanliliuyName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份
	 */
    public Integer getGuanliliuyTypes() {
        return guanliliuyTypes;
    }
    /**
	 * 设置：身份
	 */

    public void setGuanliliuyTypes(Integer guanliliuyTypes) {
        this.guanliliuyTypes = guanliliuyTypes;
    }
    /**
	 * 获取：院系
	 */
    public Integer getYuanxiTypes() {
        return yuanxiTypes;
    }
    /**
	 * 设置：院系
	 */

    public void setYuanxiTypes(Integer yuanxiTypes) {
        this.yuanxiTypes = yuanxiTypes;
    }
    /**
	 * 获取：当天体温
	 */
    public Double getGuanliliuyTiwen() {
        return guanliliuyTiwen;
    }
    /**
	 * 设置：当天体温
	 */

    public void setGuanliliuyTiwen(Double guanliliuyTiwen) {
        this.guanliliuyTiwen = guanliliuyTiwen;
    }
    /**
	 * 获取：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }
    /**
	 * 设置：有无咳嗽
	 */

    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 获取：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }
    /**
	 * 设置：有无外出
	 */

    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 获取：外出地点
	 */
    public String getGuanliliuyDidian() {
        return guanliliuyDidian;
    }
    /**
	 * 设置：外出地点
	 */

    public void setGuanliliuyDidian(String guanliliuyDidian) {
        this.guanliliuyDidian = guanliliuyDidian;
    }
    /**
	 * 获取：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }
    /**
	 * 设置：是否接触病患
	 */

    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 获取：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }
    /**
	 * 设置：是否出入高风险区域
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 获取：健康情况详情
	 */
    public String getGuanliliuyContent() {
        return guanliliuyContent;
    }
    /**
	 * 设置：健康情况详情
	 */

    public void setGuanliliuyContent(String guanliliuyContent) {
        this.guanliliuyContent = guanliliuyContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Guanliliuy{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", guanliliuyName=" + guanliliuyName +
            ", sexTypes=" + sexTypes +
            ", guanliliuyTypes=" + guanliliuyTypes +
            ", yuanxiTypes=" + yuanxiTypes +
            ", guanliliuyTiwen=" + guanliliuyTiwen +
            ", keshouTypes=" + keshouTypes +
            ", wuaichuTypes=" + wuaichuTypes +
            ", guanliliuyDidian=" + guanliliuyDidian +
            ", binghuanTypes=" + binghuanTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", guanliliuyContent=" + guanliliuyContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
