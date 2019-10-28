package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 手术护理记录子集
 */
public class HDSD00_08_05 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_08_05(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.39\"/>\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "  <code code=\"C0019\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>手术护理记录</title>\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "  <!--N-->\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <!--N:全部改为zh-CN，ＯＫ-->\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--门（急）诊号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "      <!--住院号：DE01.00.014.00  @@@参照OID分配表修改 -->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!--N:有就填-->\n" +
                        "        <age value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\" unit=\"岁\"/>\n" +
                        "      </patient>\n" +
                        "      <providerOrganization>\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 文档作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <!--签名日期时间：DE09.00.053.00-->\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <code displayName=\"巡台护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <!-- 文档生成机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <!-- 签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间：DE09.00.053.00 -->\n" +
                        "    <time value=\"201210240910\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"巡台护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间：DE09.00.053.00 -->\n" +
                        "    <time value=\"201210240910\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"器械护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间：DE09.00.053.00 -->\n" +
                        "    <time value=\"201210240910\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"交接护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间：DE09.00.053.00 -->\n" +
                        "    <time value=\"201210240910\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"转运者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <!--姓名-->\n" +
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
                        "      <!-- 入院日期时间 -->\n" +
                        "      <effectiveTime/>\n" +
                        "      <location>\n" +
                        "        <healthCareFacility>\n" +
                        "          <serviceProviderOrganization>\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!-- DE01.00.026.00  病床号 -->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!-- DE01.00.019.00  病房号 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!-- DE08.10.026.00  科室名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                        <!-- DE08.10.054.00  病区名称 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                            <!--XXX医院 -->\n" +
                        "                            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                                <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "                                <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "                              </wholeOrganization>\n" +
                        "                            </asOrganizationPartOf>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </serviceProviderOrganization>\n" +
                        "        </healthCareFacility>\n" +
                        "      </location>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--术前诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10219-4\" displayName=\"Surgical operation note preoperative Dx\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--生命体征章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8716-3\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"VITAL SIGNS\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.188.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体重（kg）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"kg\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 实验室检查章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"30954-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"STUDIES SUMMARY\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 血型-->\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                <!-- ABO血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_001_00") + "\" displayName=\"A型\" codeSystem=\"2.16.156.10011.2.3.1.85\" codeSystemName=\"ABO血型代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <!-- Rh(d)血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_010_00") + "\" displayName=\"阴性\" codeSystem=\"2.16.156.10011.2.3.1.250\" codeSystemName=\"Rh(d)血型代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--皮肤章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29302-7\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"INTEGUMENTARY SYSTEM\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.126.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"皮肤检查描述\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_126_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 过敏史章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry typeCode=\"DRIV\">\n" +
                        "            <act classCode=\"ACT\" moodCode=\"EVN\">\n" +
                        "              <code/>\n" +
                        "              <entryRelationship typeCode=\"SUBJ\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE02.10.023.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史标志\"/>\n" +
                        "                  <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE02_10_023_00") + "\"/>\n" +
                        "                  <participant typeCode=\"CSM\">\n" +
                        "                    <participantRole classCode=\"MANU\">\n" +
                        "                      <playingEntity classCode=\"MMAT\">\n" +
                        "                        <!--过敏史描述-->\n" +
                        "                        <code code=\"DE02.10.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史\"/>\n" +
                        "                        <desc xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_022_00") + "</desc>\n" +
                        "                      </playingEntity>\n" +
                        "                    </participantRole>\n" +
                        "                  </participant>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </act>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--护理记录章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"护理记录\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.211.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理等级代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_211_00") + "\" displayName=\"特级护理\" codeSystem=\"2.16.156.10011.2.3.1.259\" codeSystemName=\"护理等级代码\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.212.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理类型代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_212_00") + "\" displayName=\"基础护理\" codeSystem=\"2.16.156.10011.2.3.1.260\" codeSystemName=\"护理类型代码\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--护理观察章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"护理观察\"/>\n" +
                        "          <text/>\n" +
                        "          <!--多个观察写多个entry即可，每个观察对应着观察结果描述-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察项目名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_031_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察结果\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--护理操作章节：一个护理操作对应多个操作项目类目，一个操作项目类目又对应多个操作结果-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"护理操作\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.342.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理操作名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_342_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.210.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理操作项目类目名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_210_00") + "</value>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE06.00.209.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理操作结果\"/>\n" +
                        "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_209_00") + "</value>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--器械物品核对章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"术前器械物品核对\"/>\n" +
                        "          <text/>\n" +
                        "          <!--术前-->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <code/>\n" +
                        "              <statusCode code=\"completed\"/>\n" +
                        "              <!--巡台护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"巡台护士\"/>\n" +
                        "                  <!--巡台护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>杨丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--器械护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"201210240910\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"器械护士\"/>\n" +
                        "                  <!--器械护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>王丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.042.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术中所用物品名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_042_00") + "</value>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE09.00.111.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前清点标志\"/>\n" +
                        "                      <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE09_00_111_00") + "\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <!--关前核对-->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <code/>\n" +
                        "              <statusCode/>\n" +
                        "              <!--巡台护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"201210240910\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"巡台护士\"/>\n" +
                        "                  <!--巡台护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>杨丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--器械护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"201210240910\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"器械护士\"/>\n" +
                        "                  <!--器械护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>王丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.042.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术中所用物品名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_042_00") + "</value>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE06.00.204.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"关前核对标志\"/>\n" +
                        "                      <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE09_00_111_00") + "\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <!--关后核对-->\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <code/>\n" +
                        "              <statusCode code=\"completed\"/>\n" +
                        "              <!--巡台护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"201210240910\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"巡台护士\"/>\n" +
                        "                  <!--巡台护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>杨丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <!--器械护士-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <!--签名日期时间：DE09.00.053.00-->\n" +
                        "                <time value=\"201210240910\"/>\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"器械护士\"/>\n" +
                        "                  <!--器械护士签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>王丽</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.042.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术中所用物品名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_042_00") + "</value>\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE06.00.204.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"关后核对标志\"/>\n" +
                        "                      <value xsi:type=\"BL\" value=\"true\"/>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--手术操作章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 1..1 手术记录 -->\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <!--手术及操作编码:DE06.00.093.00-->\n" +
                        "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <!--手术时间：开始日期时间DE06.00.218.00、结束日期时间DE06.00.221.00-->\n" +
                        "              <effectiveTime>\n" +
                        "                <low value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "                <high value=\"" + cdaData.getCustomCol("DE06_00_017_00") + "\"/>\n" +
                        "              </effectiveTime>\n" +
                        "              <!--手术目标部位名称：DE06.00.187.00-->\n" +
                        "              <targetSiteCode code=\"" + cdaData.getCustomCol("DE06_00_187_00") + "\" displayName=\"左前胸\" codeSystem=\"2.16.156.10011.2.3.1.266\" codeSystemName=\"手术目标部位编码\"/>\n" +
                        "              <!--手术操作者：DE02.01.039.00-->\n" +
                        "              <performer>\n" +
                        "                <assignedEntity>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <code displayName=\"手术操作者\"/>\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.30.060.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术中病理标志\"/>\n" +
                        "                  <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE04_30_060_00") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.317.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"准备事项\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_317_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.256.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术间编号\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_256_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!-- 出入手术室时间  -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "                  <statusCode/>\n" +
                        "                  <!-- DE06.00.236.00  入手术室日期时间 DE06.00.191.00  出手术室日期时间 -->\n" +
                        "                  <effectiveTime>\n" +
                        "                    <low value=\"" + cdaData.getCustomCol("DE06_00_236_00") + "\"/>\n" +
                        "                    <high value=\"" + cdaData.getCustomCol("DE06_00_191_00") + "\"/>\n" +
                        "                  </effectiveTime>\n" +
                        "                </organizer>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--住院过程章节 术后交接-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                        "          <title>住院过程章节</title>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.206.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"病人交接核对项目\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_206_00") + "</value>\n" +
                        "              <!--交接护士-->\n" +
                        "              <author>\n" +
                        "                <!--交接日期时间：DE09.00.107.00-->\n" +
                        "                <time value=\"" + cdaData.getCustomCol("DE09_00_107_00") + "\"/>\n" +
                        "                <assignedAuthor>\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <code displayName=\"交接护士\"/>\n" +
                        "                  <!--交接护士签名：DE02.01.039.00-->\n" +
                        "                  <assignedPerson>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </assignedPerson>\n" +
                        "                </assignedAuthor>\n" +
                        "              </author>\n" +
                        "              <!--转运者-->\n" +
                        "              <participant typeCode=\"ATND\">\n" +
                        "                <participantRole classCode=\"ASSIGNED\">\n" +
                        "                  <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                  <!--角色-->\n" +
                        "                  <code displayName=\"转运者\"/>\n" +
                        "                  <!--转运者签名：DE02.01.039.00-->\n" +
                        "                  <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                    <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                  </playingEntity>\n" +
                        "                </participantRole>\n" +
                        "              </participant>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
