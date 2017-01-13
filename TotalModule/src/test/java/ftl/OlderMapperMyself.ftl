${r'<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.idea.cjyl.totalmodule.web.dao.myself.'}${fileName}${r'">'}

        <#list vo2XmlInfo.resultMapList as resultMapOne>

            ${r'<resultMap'} id="${resultMapOne.id}" type="${resultMapOne.type}${r'">'}
                ${r'<id'} column="${resultMapOne.resultMapId.columnName}" property="${resultMapOne.resultMapId.propertyName}" jdbcType="${resultMapOne.resultMapId.jdbcTypeName}${r'"/>'}
                <#list resultMapOne.resultResults as resultResultsOne>
                ${r'<result'} column="${resultResultsOne.columnName}" property="${resultResultsOne.propertyName}" jdbcType="${resultResultsOne.jdbcTypeName}"${r'/>'}
                </#list>
                <#list resultMapOne.resultAssociations as resultAssociationsOne>
                ${r'<association'} property="${resultAssociationsOne.propertyName}" resultMap="${resultAssociationsOne.resultMapName}${r'"></association>'}
                </#list>
                <#list resultMapOne.resultCollections as resultCollectionsOne>
                ${r'<collection'} property="${resultCollectionsOne.propertyName}" resultMap="${resultCollectionsOne.resultMapName}${r'"></collection>'}
                </#list>
             ${r'</resultMap>'}

        </#list>





        ${r'<sql id="Base_Column_List">'}
            ${vo2XmlInfo.baseColumnList}
        ${r'</sql>'}



${r'<sql id="Example_Where_Clause">
        <where>
            <foreach collection="oredCriteria" item="criteria" separator="or">
                <if test="criteria.valid">
                    <trim prefix="(" suffix=")" prefixOverrides="and">
                        <foreach collection="criteria.criteria" item="criterion">
                            <choose>
                                <when test="criterion.noValue">
                                    and ${criterion.condition}
                                </when>
                                <when test="criterion.singleValue">
                                    and ${criterion.condition} #{criterion.value}
                                </when>
                                <when test="criterion.betweenValue">
                                    and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}
                                </when>
                                <when test="criterion.listValue">
                                    and ${criterion.condition}
                                    <foreach collection="criterion.value" item="listItem" open="(" close=")"
                                             separator=",">
                                    #{listItem}
                                    </foreach>
                                </when>
                            </choose>
                        </foreach>
                    </trim>
                </if>
            </foreach>
        </where>
    </sql>'}



        ${r'<select id="findAllVO" resultMap="BaseResultMap">'}

        SELECT
        ${r'<include refid="Base_Column_List"></include>'}
        ${vo2XmlInfo.leftInfo}


        ${r'</select>'}

        ${r'<select id="findVOByExapmle" resultMap="BaseResultMap"'}
            parameterType="${vo2XmlInfo.exampleType}"${r'>'}


        select
        ${r'<if test="distinct">'}
            distinct
        ${r'</if>
        <include refid="Base_Column_List"/>'}
        ${vo2XmlInfo.leftInfo}

        ${r'<if test="_parameter != null">
            <include refid="Example_Where_Clause"/>
        </if>
        <if test="orderByClause != null">
            order by ${orderByClause}
        </if>
    </select>'}

     ${r'<select id="selectVOByPrimaryKey" parameterType="java.lang.Long">
        select
        <include refid="Base_Column_List"/>'}
        ${vo2XmlInfo.leftInfo}
        ${r'WHERE older.id = #{id,jdbcType=BIGINT}
    </select>
</mapper>'}