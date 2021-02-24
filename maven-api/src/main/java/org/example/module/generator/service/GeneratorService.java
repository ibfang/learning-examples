package org.example.module.generator.service;

import org.springframework.stereotype.Service;

/**
 *  @ Service注解用于类上，标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中，
 *  不需要再在applicationContext.xml文件定义bean了
 * 代码生成器——service层
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/5.
 */
@Service
public class GeneratorService {


    /**
     * 获取表列表
     * @param name
     * @param page
     * @param limit
     * @return
     */
//    public Output getTableList(String name,int page,int limit){
        // 使用预编译防止sql注入
//        StringBuilder sql = new StringBuilder("");
//        sql.append(" select table_name ,table_comment from information_schema.tables ");
//        sql.append(" where table_schema = (select database()) ");
//        sql.append(" and table_name like ? order by create_time desc" );
//        Query query = em.createNativeQuery(sql);
//        query.setFirstResult((page - 1) * limit);
//        query.setMaxResults(limit);
//        query.setParameter(1, StringUtils.isNotBlank(name) ? ("%" + name + "%") : "%%");
//        List<Object[]> result = query.getResultList();
//        List<TableInfo> tableInfos = new ArrayList<>();
//        for (Object[] obj : result) {
//            TableInfo tableInfo = new TableInfo();
//            tableInfo.setTableName(String.valueOf(obj[0]));
//            tableInfo.setTableComment(String.valueOf(obj[1]));
//            tableInfos.add(tableInfo);
//        }
//        Query query1 = em.createNativeQuery("SELECT COUNT(*) from information_schema.tables where table_schema = (select database())");
//        BigInteger totalElements = (BigInteger) query1.getSingleResult();
//        Pageable pageable = PageRequest.of(page - 1, limit);
//        Page<TableInfo> tableInfoPage = new PageImpl<>(tableInfos, pageable, totalElements.longValue());
//        return tableInfoPage;
//    }
}
