<?xml version="1.0"?>
<?mso-application progid="Excel.Sheet"?>
<Workbook xmlns="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:o="urn:schemas-microsoft-com:office:office"
 xmlns:x="urn:schemas-microsoft-com:office:excel"
 xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:html="http://www.w3.org/TR/REC-html40">
 <DocumentProperties xmlns="urn:schemas-microsoft-com:office:office">
  <Author>梁铭佳</Author>
  <LastAuthor>梁铭佳</LastAuthor>
  <Created>2016-01-05T10:03:01Z</Created>
  <LastSaved>2016-01-05T10:11:23Z</LastSaved>
  <Company>Microsoft</Company>
  <Version>14.00</Version>
 </DocumentProperties>
 <OfficeDocumentSettings xmlns="urn:schemas-microsoft-com:office:office">
  <AllowPNG/>
 </OfficeDocumentSettings>
 <ExcelWorkbook xmlns="urn:schemas-microsoft-com:office:excel">
  <WindowHeight>9630</WindowHeight>
  <WindowWidth>20475</WindowWidth>
  <WindowTopX>600</WindowTopX>
  <WindowTopY>105</WindowTopY>
  <ProtectStructure>False</ProtectStructure>
  <ProtectWindows>False</ProtectWindows>
 </ExcelWorkbook>
 <Styles>
  <Style ss:ID="Default" ss:Name="Normal">
   <Alignment ss:Vertical="Center"/>
   <Borders/>
   <Font ss:FontName="宋体" x:CharSet="134" ss:Size="11" ss:Color="#000000"/>
   <Interior/>
   <NumberFormat/>
   <Protection/>
  </Style>
 </Styles>
 <Worksheet ss:Name="Sheet1">
  <Table ss:ExpandedColumnCount="12" ss:ExpandedRowCount="${(list?size)+1}" x:FullColumns="1"
   x:FullRows="1" ss:DefaultColumnWidth="54" ss:DefaultRowHeight="13.5">
   <Column ss:AutoFitWidth="0" ss:Width="98.25"/>
   <Column ss:Index="5" ss:AutoFitWidth="0" ss:Width="82.5"/>
   <Column ss:AutoFitWidth="0" ss:Width="99.75"/>
   <Column ss:Index="9" ss:AutoFitWidth="0" ss:Width="59.25"/>
   <Column ss:AutoFitWidth="0" ss:Width="123"/>
   <Column ss:AutoFitWidth="0" ss:Width="63"/>
   <Column ss:AutoFitWidth="0" ss:Width="100.5"/>
   <Row>
    <Cell><Data ss:Type="String">简历编号</Data></Cell>
    <Cell><Data ss:Type="String">姓名</Data></Cell>
    <Cell><Data ss:Type="String">性别</Data></Cell>
    <Cell><Data ss:Type="String">年龄</Data></Cell>
    <Cell><Data ss:Type="String">电话</Data></Cell>
    <Cell><Data ss:Type="String">Email</Data></Cell>
    <Cell><Data ss:Type="String">学历</Data></Cell>
    <Cell><Data ss:Type="String">工作经验</Data></Cell>
    <Cell><Data ss:Type="String">工作状态</Data></Cell>
    <Cell><Data ss:Type="String">意向职位</Data></Cell>
    <Cell><Data ss:Type="String">意向行业</Data></Cell>
    <Cell><Data ss:Type="String">期望工作地</Data></Cell>
   </Row>
   <#list list as item >
   <Row>
    <Cell><Data ss:Type="String">${item.rid}</Data></Cell>
    <Cell><Data ss:Type="String">${item.userinfo.baseInfoName}</Data></Cell>
    <Cell><Data ss:Type="String"><#if item.userinfo.gender==1>男 <#elseif item.userinfo.gender==2>女</#if></Data></Cell>
    <Cell><Data ss:Type="String">${item.birthday}岁</Data></Cell>
    <Cell><Data ss:Type="String">${item.userinfo.mobile}</Data></Cell>
    <Cell><Data ss:Type="String">${item.userinfo.email}</Data></Cell>
    <Cell><Data ss:Type="String">${item.degreeName}</Data></Cell>
    <Cell><Data ss:Type="String">${item.workExpName}</Data></Cell>
    <Cell><Data ss:Type="String"><#if item.intension.workingStatus==1>离职<#elseif item.intension.workingStatus==2>在职</#if></Data></Cell>
    <Cell><Data ss:Type="String">${item.intension.expWork}</Data></Cell>
    <Cell><Data ss:Type="String">${item.intension.expIndustry}</Data></Cell>
    <Cell><Data ss:Type="String">${item.intension.expWorkplace}</Data></Cell>
   </Row>
    </#list>
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <Header x:Margin="0.3"/>
    <Footer x:Margin="0.3"/>
    <PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7" x:Top="0.75"/>
   </PageSetup>
   <Selected/>
   <Panes>
    <Pane>
     <Number>3</Number>
     <ActiveRow>7</ActiveRow>
     <ActiveCol>1</ActiveCol>
    </Pane>
   </Panes>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
 <Worksheet ss:Name="Sheet2">
  <Table ss:ExpandedColumnCount="1" ss:ExpandedRowCount="1" x:FullColumns="1"
   x:FullRows="1" ss:DefaultColumnWidth="54" ss:DefaultRowHeight="13.5">
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <Header x:Margin="0.3"/>
    <Footer x:Margin="0.3"/>
    <PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7" x:Top="0.75"/>
   </PageSetup>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
 <Worksheet ss:Name="Sheet3">
  <Table ss:ExpandedColumnCount="1" ss:ExpandedRowCount="1" x:FullColumns="1"
   x:FullRows="1" ss:DefaultColumnWidth="54" ss:DefaultRowHeight="13.5">
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <Header x:Margin="0.3"/>
    <Footer x:Margin="0.3"/>
    <PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7" x:Top="0.75"/>
   </PageSetup>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
</Workbook>
