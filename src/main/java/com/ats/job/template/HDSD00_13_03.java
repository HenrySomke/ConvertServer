package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 24h内入院死亡记录子集
 */
public class HDSD00_13_03 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_13_03(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <!--\n" +
                        "********************************************************\n" +
                        " CDA Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.56\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0036\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>24h内入院死亡记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <!--文档记录对象（患者） [1..*] contextControlCode=\"OP\"表示本信息可以被重载-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "      <!-- 现住址 -->\n" +
                        "      <addr use=\"H\">\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "      </addr>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\" displayName=\"男性\"/>\n" +
                        "        <maritalStatusCode code=\"" + cdaData.getCustomCol("DE02_01_018_00") + "\" displayName=\"已婚\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表（GB/T 2261.2）\"/>\n" +
                        "        <ethnicGroupCode code=\"" + cdaData.getCustomCol("DE02_01_025_00") + "\" displayName=\"汉族\" codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表（GB 3304）\"/>\n" +
                        "\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                        "        <!--职业状况-->\n" +
                        "        <occupation>\n" +
                        "          <occupationCode code=\"" + cdaData.getCustomCol("DE02_01_052_00") + "\" displayName=\"国家公务员\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况（个人身体）代码表（GB/T 2261.4）\"/>\n" +
                        "        </occupation>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE08_50_033_00") + "\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <!-- 病史陈述者 -->\n" +
                        "  <informant>\n" +
                        "    <assignedEntity>\n" +
                        "      <id/>\n" +
                        "      <!--陈述者与患者的关系代码-->\n" +
                        "      <code code=\"" + cdaData.getCustomCol("DE02_01_024_00") + "\" displayName=\"配偶\" codeSystem=\"2.16.156.10011.2.3.3.8\" codeSystemName=\"家庭关系代码表（GB/T 4761）\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </informant>\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <!-- 最终审核者签名 -->\n" +
                        "  <legalAuthenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"001\"/>\n" +
                        "      <code displayName=\"主任医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "  <!-- 接诊医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"002\"/>\n" +
                        "      <code displayName=\"接诊医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <!--住院医师签名-->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"003\"/>\n" +
                        "      <code displayName=\"住院医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <!--主治医师签名-->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"004\"/>\n" +
                        "      <code displayName=\"主治医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <effectiveTime>\n" +
                        "        <!-- 入院日期时间 -->\n" +
                        "        <low value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "        <!-- 出院日期时间 -->\n" +
                        "        <high value=\"" + cdaData.getCustomCol("DE06_00_017_00") + "\"/>\n" +
                        "      </effectiveTime>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "  <!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--主诉章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10154-3\" displayName=\"CHIEF COMPLAINT\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--主诉条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"主诉\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_01_119_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--主要健康问题章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11450-4\" displayName=\"PROBLEM LIST\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--陈述内容可靠标志-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.143.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"陈述内容可靠标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_143_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--中医“四诊”观察结果-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"中医“四诊”观察结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "入院诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"46241-6\" displayName=\"HOSPITAL ADMISSION DX\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--入院诊断-西医条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-西医诊断名称\"/>\n" +
                        "              <value xsi:type=\"ST\">创伤性脑损伤</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--入院诊断-西医诊断编码-代码-->\n" +
                        "                  <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-西医诊断编码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" displayName=\"创伤性脑损伤\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--入院诊断-中医条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医病名名称\"/>\n" +
                        "              <value xsi:type=\"ST\">内科病</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--入院诊断-中医诊断编码-代码-->\n" +
                        "                  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医病名代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"BN\" displayName=\"内科病\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（GB/T 15657-1995）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--入院诊断-中医证候编码-名称-->\n" +
                        "                  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_172_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--入院诊断-中医证候编码-代码-->\n" +
                        "                  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" displayName=\"火毒上攻证\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（GB/T 15657-1995）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--治疗计划章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--治则治法条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"INT\">\n" +
                        "              <code code=\"DE06.00.300.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"治则治法\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_300_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--住院过程章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" displayName=\"HOSPITAL COURSE\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--入院情况条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.148.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_148_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--诊疗过程描述条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.296.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"诊疗过程描述\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_296_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--死亡日期时间条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.01.036.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡日期时间\"/>\n" +
                        "              <effectiveTime>\n" +
                        "                <high value=\"" + cdaData.getCustomCol("DE02_01_036_00") + "\"/>\n" +
                        "              </effectiveTime>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--死亡原因条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.099.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡原因\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_099_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--死亡诊断-西医条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-西医诊断名称\"/>\n" +
                        "              <value xsi:type=\"ST\">创伤性脑损伤</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--死亡诊断-西医诊断编码-代码-->\n" +
                        "                  <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-西医诊断编码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"S06.902\" displayName=\"创伤性脑损伤\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--死亡诊断-中医条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医病名名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_172_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--死亡诊断-中医诊断编码-代码-->\n" +
                        "                  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医病名代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"BN\" displayName=\"内科病\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（GB/T 15657-1995）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--死亡诊断-中医证候编码-名称-->\n" +
                        "                  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医证候名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_172_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <!--死亡诊断-中医证候编码-代码-->\n" +
                        "                  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医证候代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" displayName=\"火毒上攻证\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（GB/T 15657-1995）\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
