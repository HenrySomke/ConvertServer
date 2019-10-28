package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 急诊留观病历子集
 */
public class HDSD00_03_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_03_01(CDAData cdaData) {
        CDA = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                "\n" +
                "  <realmCode code=\"CN\"/>\n" +
                "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                "  <templateId  root=\"2.16.156.10011.2.1.1.21\"/>\n" +
                "\n" +
                "  <!-- 文档流水号 -->\n" +
                "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                "\n" +
                "  <code code=\"C0003\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"></code>\n" +
                "  <title>急诊留观病历</title>\n" +
                "\n" +
                "  <!-- 文档机器生成时间 -->\n" +
                "  <effectiveTime value=\"20121024154823\"/>\n" +
                "\n" +
                "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                "  <languageCode code=\"zh-CN\"/>\n" +
                "  <setId/>\n" +
                "  <versionNumber/>\n" +
                "\n" +
                "<recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                "    <patientRole classCode=\"PAT\">\n" +
                "\n" +
                "      <!--门（急）诊号标识 -->\n" +
                "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                "\n" +
                "      <!--电子申请单编号-->\n" +
                "      <id root=\"2.16.156.10011.1.24\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                "\n" +
                "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "\n" +
                "        <!--患者身份证号标识-->\n" +
                "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                "\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                "\n" +
                "      </patient>\n" +
                "      <providerOrganization>\n" +
                "        <id root=\"2.16.156.10011.1.26\"/>\n" +
                "        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                "        <asOrganizationPartOf>\n" +
                "          <wholeOrganization>\n" +
                "            <!-- 机构代码 -->\n" +
                "            <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构代码\"/>\n" +
                "            <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                "          </wholeOrganization>\n" +
                "        </asOrganizationPartOf>\n" +
                "      </providerOrganization>\n" +
                "    </patientRole>\n" +
                "  </recordTarget>\n" +
                "\n" +
                "<!--创建者-->\n" +
                "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                "    <!-- 就诊日期时间 -->\n" +
                "    <time value=\"" + cdaData.getCustomCol("DE06_00_026_00") + "\"/>\n" +
                "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                "      <!-- 就诊医师 -->\n" +
                "      <assignedPerson>\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedAuthor>\n" +
                "  </author>\n" +
                "\n" +
                "  <!-- 保管机构 -->\n" +
                "  <custodian typeCode=\"CST\">\n" +
                "      <assignedCustodian classCode=\"ASSIGNED\">\n" +
                "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                "        <name>xx医院</name>\n" +
                "        </representedCustodianOrganization>\n" +
                "    </assignedCustodian>\n" +
                "  </custodian>\n" +
                "\n" +
                "<!-- 医师签名 -->\n" +
                "  <legalAuthenticator>\n" +
                "    <time/>\n" +
                "    <signatureCode/>\n" +
                "    <assignedEntity>\n" +
                "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                "      <code displayName=\"责任医生\"/>\n" +
                "      <assignedPerson>\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedEntity>\n" +
                "  </legalAuthenticator>\n" +
                "\n" +
                "  <relatedDocument typeCode=\"RPLC\">\n" +
                "    <parentDocument>\n" +
                "      <id/>\n" +
                "      <setId/>\n" +
                "      <versionNumber/>\n" +
                "    </parentDocument>\n" +
                "  </relatedDocument>\n" +
                "\n" +
                "  <component>\n" +
                "    <structuredBody>\n" +
                "      <!-- 过敏史章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.023.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史标志\"></code>\n" +
                "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE02_01_023_00") + "\"></value>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE05.01.022.00\" displayName=\"过敏史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_022_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
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
                "\n" +
                "      <!--现病史章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"10164-2\" displayName=\"HISTORY OF PRESENT ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!--现病史条目-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.071.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"现病史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_071_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 既往史章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.099.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"既往史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_099_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!--体格检查章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"29545-1\" displayName=\"PHYSICAL EXAMINATION\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!--体格检查-一般状况检查结果-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE04.10.258.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体格检查\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_258_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 实验室检验章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE04.30.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"辅助检查项目\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_010_00") + "</value>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE04.30.009.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"辅助检查结果\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_009_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "            </observation>\n" +
                "           </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 诊断记录章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "                   <code code=\"29548-5\" displayName=\"Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "          <!--初诊标志代码-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.196.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"初诊标志代码\"/>\n" +
                "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_196_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.39\" codeSystemName=\"初诊标志代码表\" displayName=\"初诊\"/>\n" +
                "            </observation>\n" +
                "           </entry>\n" +
                "          <!--中医“四诊”观察结果-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.028.00\" displayName=\"中医“四诊”观察结果\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_028_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "\n" +
                "                    <!--条目：诊断-->\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.01.024.00\" displayName=\"诊断代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.1\" codeSystemName=\"诊断代码表（ICD-10）\"></value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.01.025.00\" displayName=\"诊断名称\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                            <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_025_00") + "</value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.10.130.00\" displayName=\"中医病名代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医病名代码\"></name></qualifier></code>\n" +
                "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\"></value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.10.172.00\" displayName=\"中医病名名称\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医病名名称\"></name></qualifier></code>\n" +
                "                            <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_172_00") + "</value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.10.130.00\" displayName=\"中医证候代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医证候代码\"></name></qualifier></code>\n" +
                "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\"></value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.10.172.00\" displayName=\"中医证候名称\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医证候名称\"></name></qualifier></code>\n" +
                "                            <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_172_00") + "</value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "\n" +
                "               </section>\n" +
                "            </component>\n" +
                "\n" +
                "      <!-- 治疗计划章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!--辨证依据描述-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE05.10.132.00\" displayName=\"辨证依据\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_132_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "          <!--治则治法-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.300.00\" displayName=\"治则治法\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_300_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!--医嘱章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"46209-3\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"Provider Orders\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "\n" +
                "          <entry>\n" +
                "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                "              <statusCode/>\n" +
                "              <component>\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.289.00\" displayName=\"医嘱项目类型\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_289_00") + "\" displayName=\"用药类医嘱\" codeSystem=\"2.16.156.10011.2.3.1.268\" codeSystemName=\"医嘱项目类型代码表\"/>\n" +
                "                </observation>\n" +
                "              </component>\n" +
                "              <component>\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.288.00\" displayName=\"医嘱项目内容\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                "                  <effectiveTime>\n" +
                "                    <!--医嘱计划开始日期时间-->\n" +
                "                    <low value=\"" + cdaData.getCustomCol("DE06_00_222_00") + "\"/>\n" +
                "                    <!--医嘱计划结束日期时间-->\n" +
                "                    <high value=\"" + cdaData.getCustomCol("DE06_00_219_00") + "\"/>\n" +
                "                  </effectiveTime>\n" +
                "                  <!--医嘱计划信息-->\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_288_00") + "</value>\n" +
                "                  <!--执行者-->\n" +
                "                  <performer>\n" +
                "                    <!--医嘱执行日期时间：DE06.00.222.00-->\n" +
                "                    <time value=\"" + cdaData.getCustomCol("DE06_00_222_00") + "\"/>\n" +
                "                    <assignedEntity>\n" +
                "                      <id root=\"2.16.156.10011.1.4\"/>\n" +
                "                      <!--角色-->\n" +
                "                      <code displayName=\"医嘱执行者\"/>\n" +
                "                      <!--医嘱执行者签名：DE02.01.039.00-->\n" +
                "                      <assignedPerson>\n" +
                "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "                      </assignedPerson>\n" +
                "                      <!--医嘱执行科室：DE08.10.026.00-->\n" +
                "                      <representedOrganization>\n" +
                "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                "                      </representedOrganization>\n" +
                "                    </assignedEntity>\n" +
                "                  </performer>\n" +
                "                  <!--作者：医嘱开立者-->\n" +
                "                  <author>\n" +
                "                    <!--医嘱开立日期时间：DE06.00.220.00-->\n" +
                "                    <time value=\"" + cdaData.getCustomCol("DE06_00_220_00") + "\"/>\n" +
                "                    <assignedAuthor>\n" +
                "                      <id root=\"2.16.156.10011.1.4\"/>\n" +
                "                      <!--角色-->\n" +
                "                      <code displayName=\"医嘱开立者\"/>\n" +
                "                      <!--医嘱开立者签名：DE02.01.039.00-->\n" +
                "                      <assignedPerson>\n" +
                "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "                      </assignedPerson>\n" +
                "                      <!--医嘱开立科室：DE08.10.026.00-->\n" +
                "                      <representedOrganization>\n" +
                "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                "                      </representedOrganization>\n" +
                "                    </assignedAuthor>\n" +
                "                  </author>\n" +
                "                  <!--医嘱审核-->\n" +
                "                  <participant typeCode=\"ATND\">\n" +
                "                    <!--医嘱审核日期时间：DE09.00.088.00-->\n" +
                "                    <time value=\"" + cdaData.getCustomCol("DE06_00_088_00") + "\"/>\n" +
                "                    <participantRole classCode=\"ASSIGNED\">\n" +
                "                      <id root=\"2.16.156.10011.1.4\"/>\n" +
                "                      <!--角色-->\n" +
                "                      <code displayName=\"医嘱审核人\"/>\n" +
                "                      <!--医嘱审核人签名：DE02.01.039.00-->\n" +
                "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "                      </playingEntity>\n" +
                "                    </participantRole>\n" +
                "                  </participant>\n" +
                "                  <!--医嘱取消-->\n" +
                "                  <participant typeCode=\"ATND\">\n" +
                "                    <!--医嘱取消日期时间：DE06.00.234.00-->\n" +
                "                    <time value=\"" + cdaData.getCustomCol("DE06_00_234_00") + "\"/>\n" +
                "                    <participantRole classCode=\"ASSIGNED\">\n" +
                "                      <id root=\"2.16.156.10011.1.4\"/>\n" +
                "                      <!--角色-->\n" +
                "                      <code displayName=\"医嘱取消人\"/>\n" +
                "                      <!--取消医嘱者签名：DE02.01.039.00-->\n" +
                "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "                      </playingEntity>\n" +
                "                    </participantRole>\n" +
                "                  </participant>\n" +
                "                  <!--医嘱备注信息-->\n" +
                "                  <entryRelationship typeCode=\"COMP\">\n" +
                "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                      <code code=\"DE06.00.179.00\" displayName=\"医嘱备注信息\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_179_00") + "</value>\n" +
                "                    </observation>\n" +
                "                  </entryRelationship>\n" +
                "                  <!--医嘱执行状态-->\n" +
                "                  <entryRelationship typeCode=\"COMP\">\n" +
                "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                      <code code=\"DE06.00.290.00\" displayName=\"医嘱执行状态\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_290_00") + "</value>\n" +
                "                    </observation>\n" +
                "                  </entryRelationship>\n" +
                "                </observation>\n" +
                "              </component>\n" +
                "            </organizer>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +

                "<!-- 手术操作章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <entry>\n" +
                "            <!-- 1..1 手术记录 -->\n" +
                "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_01") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                "              <statusCode/>\n" +
                "\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.094.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术（操作）名称\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_094_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.093.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术及操作目标部位名称\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_093_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE08.50.037.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"介入物名称\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_037_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.251.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"操作方法描述\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_251_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.250.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"操作次数\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_250_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "            </procedure>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 抢救记录章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code displayName=\"抢救记录章节\"/>\n" +
                "          <text/>\n" +
                "          <!-- 急诊抢救记录 抢救开始日期时间 抢救结束日期时间 急诊抢救记录 -->\n" +
                "          <entry typeCode=\"COMP\">\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.181.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"急诊抢救记录\"/>\n" +
                "              <effectiveTime>\n" +
                "                <low value=\"" + cdaData.getCustomCol("DE06_00_221_00") + "\"/>\n" +
                "                <high value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"/>\n" +
                "              </effectiveTime>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_181_00") + "</value>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                "                  <statusCode/>\n" +
                "                  <!-- 参加抢救人员名单 -->\n" +
                "                  <component>\n" +
                "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                      <code code=\"DE08.30.032.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"参加抢救人员名单\"/>\n" +
                "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_30_032_00") + "</value>\n" +
                "                    </observation>\n" +
                "                  </component>\n" +
                "                  <!-- 专业技术职务类别代码 -->\n" +
                "                  <component>\n" +
                "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                      <code code=\"DE08.30.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"专业技术职务类别代码\"/>\n" +
                "                      <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE08_30_031_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.209\" codeSystemName=\"专业技术职务类别代码表\"/>\n" +
                "                    </observation>\n" +
                "                  </component>\n" +
                "                </organizer>\n" +
                "              </entryRelationship>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 住院过程章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                "          <text/>\n" +
                "          <!-- 急诊留观病程记录　-->\n" +
                "          <entry typeCode=\"COMP\">\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.181.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"急诊留观病程记录\"/>\n" +
                "              <!-- 收入观察室日期时间  -->\n" +
                "              <effectiveTime value=\"" + cdaData.getCustomCol("DE06_00_235_00") + "\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_181_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!--  其他相关信息章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code displayName=\"其他相关信息\"/>\n" +
                "          <text/>\n" +
                "          <!-- 注意事项 -->\n" +
                "          <entry typeCode=\"COMP\">\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE09.00.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"注意事项\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE09_00_119_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "          <!-- 患者去向代码 -->\n" +
                "          <entry typeCode=\"COMP\">\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.185.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"患者去向代码\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_185_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "    </structuredBody>\n" +
                "  </component>\n" +
                "</ClinicalDocument>";
    }
}
