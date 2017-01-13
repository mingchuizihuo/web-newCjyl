package ${packageName};

<#if !implflag>
import com.idea.cjyl.core.generic.GenericServiceLevel;
<#if level>
<#else >
import com.idea.cjyl.core.generic.GenericService;
</#if>

import ${modelpackageName}.${className};
import ${modelpackageName}.${className}Example;
<#if level>
public interface ${className}Service extends GenericServiceLevel<${className},Long,${className}Example>{
<#else >
public interface ${className}Service extends GenericService<${className},Long,${className}Example>{
</#if>


}
<#else>

import com.idea.cjyl.core.generic.GenericDao;
<#if level>
import com.idea.cjyl.core.generic.GenericServiceLevelImpl;
<#else >
import com.idea.cjyl.core.generic.GenericServiceImpl;
</#if>

import ${daopackageName}.${className}Mapper;
import ${modelpackageName}.${className};
import ${modelpackageName}.${className}Example;
import ${ImplpackageName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
<#if level>
    public class ${className}ServiceImpl extends GenericServiceLevelImpl<${className}, Long,${className}Example> implements ${className}Service {
    <#else >
    public class ${className}ServiceImpl extends GenericServiceImpl<${className}, Long,${className}Example> implements ${className}Service {
</#if>

   <#if level>

        @Autowired
        private ${className}Mapper ${className?lower_case}Dao;
        @Override
        public GenericDao<${className}, Long,${className}Example> getDao() {
            return ${className?lower_case}Dao;
        }

        @Override
        public ${className}Example getModelExamplTidEqualTo(Long tid) {
            ${className}Example ${className?lower_case}Example = new ${className}Example();
            ${className?lower_case}Example.createCriteria().and${classTidName}EqualTo(tid);
            return ${className?lower_case}Example;
        }

        @Override
        public byte getLevel(${className} ${className?lower_case}) {

            return ${className?lower_case}.get${classLevelName}();
        }

        @Override
        public Long getTid(${className} ${className?lower_case}) {
            return ${className?lower_case}.get${classTidName}();
        }

        @Override
        public void setLevel(${className} ${className?lower_case}, Byte level) {
            ${className?lower_case}.set${classLevelName}(level);
        }

        @Override
        public void setTid(${className} ${className?lower_case}) {
            ${className?lower_case}.set${classTidName}(0L);
        }
       <#else>
       @Autowired
       private ${className}Mapper ${className?lower_case}Dao;
       @Override
       public GenericDao<${className}, Long,${className}Example> getDao() {
       return ${className?lower_case}Dao;
       }
   </#if>


}
</#if>